package irvine.math.z;

/**
 * Simple bit operations.
 *
 * @author Sean A. Irvine
 */
final class Bit {

  private Bit() { }

  /**
   * Number of bits needed to represent a number excluding a sign bit.
   *
   * @param n number
   * @return bit length of <code>n</code>.
   */
  static int bitLength(final Z n) {
    // Z.BASE_BITS < 32 && Z.BASE_BITS > 16;
    int bitLength = 0;
    final int sn = Math.abs(n.getSize());
    if (sn != 0) {
      bitLength = sn - 1;
      int a = n.mValue[bitLength];
      bitLength *= Z.BASE_BITS;
      if (a >= 0x10000) {
        bitLength += 16;
        a >>= 16;
      }
      if (a >= 0x100) {
        bitLength += 8;
        a >>= 8;
      }
      if (a >= 0x10) {
        bitLength += 4;
        a >>= 4;
      }
      if (a >= 0x4) {
        bitLength += 2;
        a >>= 2;
      }
      if (a >= 0x2) {
        bitLength += 2;
      } else {
        assert a > 0;
        ++bitLength;
      }
    }
    return bitLength;
  }

  /**
   * Returns the number of bits in the two's complement representation of a
   * number which differ from the sign bit. For positive numbers this is a
   * population count.
   *
   * @param n number
   * @return numbers of bits differing from the sign
   */
  static int bitCount(final Z n) {
    int bitCount = 0;
    final int sn = Math.abs(n.getSize());
    for (int i = 0; i < sn; ++i) {
      bitCount += Integer.bitCount(n.mValue[i]);
    }
    // At this stage count is correct for positive numbers
    if (n.getSize() < 0) {
      // Correct value for equivalent two's complement representation
      int i;
      for (i = 0; n.mValue[i] == 0; ++i) {
        bitCount += Z.BASE_BITS;
      }
      int v = n.mValue[i];
      if ((v & 0xFFFF) == 0) {
        bitCount += 16;
        v >>= 16;
      }
      if ((v & 0xFF) == 0) {
        bitCount += 8;
        v >>= 8;
      }
      if ((v & 0xF) == 0) {
        bitCount += 4;
        v >>= 4;
      }
      if ((v & 3) == 0) {
        bitCount += 2;
        v >>= 2;
      }
      // This next step cleverly takes into account the 1 we always
      // add in forming the two's complement, i.e. 1-(v&1)-1
      bitCount -= v & 1;
    }
    return bitCount;
  }

  /**
   * Return an odd version of a number.  If this integer is
   * zero then no change occurs but the auxiliary is set to -1;
   * otherwise shifts the number right repeatedly until the
   * right-most bit is 1. After the operation the <code>auxiliary()</code>
   * contains the number of positions shifted.  Thus,
   * <code>this=2^auxiliary()*makeOdd()</code>.
   *
   * @param n number
   * @return odd version of <code>n</code>
   */
  static Z makeOdd(final Z n) {
    if (n.getSize() == 0) {
      n.mAuxiliary = -1L;
      return n;
    }
    // Quick test for already odd, here for performance
    if ((n.mValue[0] & 1) != 0) {
      n.mAuxiliary = 0;
      return n;
    }
    int shift = 0;
    while (n.mValue[shift] == 0) {
      ++shift;
    }
    int v = n.mValue[shift];
    shift *= Z.BASE_BITS;
    while ((v & 1) == 0) {
      ++shift;
      v >>>= 1;
    }
    // Order of next two statements critical, because
    // shift right can on a shift of 1 set mAuxiliary
    final Z r = Shift.shiftRight(n, shift);
    n.mAuxiliary = shift;
    r.mAuxiliary = shift;
    return r;
  }

  /**
   * Return the index of the lowest set bit in an integer. Returns
   * -1 if there are no set bits (i.e. this integer is zero).
   *
   * @param n number
   * @return index of lowest set bit.
   */
  static int getLowestSetBit(final Z n) {
    if (n.getSize() == 0) {
      return -1;
    }
    int i, r = 0;
    for (i = 0; n.mValue[i] == 0; ++i, r += Z.BASE_BITS) {
      // DO NOTHING
    }
    int v = n.mValue[i];
    while ((v & 1) == 0) {
      ++r;
      v >>>= 1;
    }
    return r;
  }
}
