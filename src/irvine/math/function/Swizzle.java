package irvine.math.function;

import irvine.math.z.Z;

/**
 * Step to the next number with the same number of set bits.
 * @author Sean A. Irvine
 */
class Swizzle extends AbstractFunction1 {

  // The swizzle function from HAKMEM 175

  @Override
  public Z z(final Z n) {
    final Z lowestBit = n.and(n.negate());
    final Z leftBits = n.add(lowestBit);
    final Z changedBits = n.xor(leftBits);
    final Z rightBits = changedBits.divide(lowestBit).shiftRight(2);
    return leftBits.or(rightBits);
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(l(n));
  }

  @Override
  public Z z(final int n) {
    return Z.valueOf(l(n));
  }

  @Override
  public long l(final long n) {
    final long lowestBit = n & -n;
    final long leftBits = n + lowestBit;
    final long changedBits = n ^ leftBits;
    final long rightBits = (changedBits / lowestBit) >>> 2;
    return leftBits | rightBits;
  }

  @Override
  public int i(final int n) {
    final int lowestBit = n & -n;
    final int leftBits = n + lowestBit;
    final int changedBits = n ^ leftBits;
    final int rightBits = (changedBits / lowestBit) >>> 2;
    return leftBits | rightBits;
  }
}
