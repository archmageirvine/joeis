package irvine.oeis.a282;

import irvine.oeis.FilterNumberSequence;

/**
 * A282107 Numbers n with k digits in base x (MSD(n)_x=d_k, LSD(n)_x=d_1) such that, chosen one of their digits in position d_k &lt; j &lt; d_1, is Sum_{i=j+1..k}{(i-j)*d_i} = Sum_{i=1..j-1}{(j-i)*d_i}. Case x = 2.
 * @author Georg Fischer
 */
public class A282107 extends FilterNumberSequence {

  /**
   * Convert a number into a 1-based array of digits.
   * @param base number base
   * @param v number to be converted
   * @return an array with a[0] = number of digits, a[1] = least significant digit and a[a[0]] = most significant digit
   */
  public static int[] toDigits(final int base, long v) {
    final int[] a = new int[512]; // never more than 511 digits
    int ia = 0; // skip over a[0]
    while (v != 0) {
      a[++ia] = Math.toIntExact(v % base);
      v /= base;
    }
    a[0] = ia; // nops(a)
    return a;
  }

  /**
   * Test the property of such sequences.
   * @param base number base
   * @param n number to be converted
   * @param shift 0 for A282107-115, 1 for A282143-152
   * @return an array with a[0] = number of digits, a[1] = least significant digit and a[a[0]] = most significant digit
   */
  public static boolean is(final int base, final long n, final int shift) {
    /* Maple:
       P:=proc(n, h) local a, j, k: a:=convert(n, base, h):
       for k from 1 to nops(a)-1 do
       if add(a[j]*(k-j  ), j=1..k)=add(a[j]*(j-k), j=k+1..nops(a)) # A282107
       then RETURN(n); break: fi: od: end: seq(P(i, 2), i=1..10^3);

       if add(a[j]*(k-j+1), j=1..k)=add(a[j]*(j-k), j=k+1..nops(a)) # A282143
    */
    final int[] a = toDigits(base, n);
    final int nops = Math.toIntExact(a[0]);
    for (int k = 1; k <= nops - 1; ++k) {
      long lsum = 0;
      for (int j = 1; j <= k; ++j) {
        lsum += (long) a[j] * (k - j + shift);
      }
      long rsum = 0;
      for (int j = k + 1; j <= nops; ++j) {
        rsum += (long) a[j] * (j - k);
      }
      if (lsum == rsum) {
        return true;
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A282107() {
    this(1, 2, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base number base
   * @param shift 0 for A282107-115, 1 for A282143-152
   */
  public A282107(final int offset, final int base, final int shift) {
    super(offset, 1, k -> is(base, k, shift));
  }
}
