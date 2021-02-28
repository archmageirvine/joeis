package irvine.oeis.a043;
// manually 2021-02-28

import irvine.math.z.Z;

/**
 * A043045 a(n)=(s(n)+2)/3, where s(n)=n-th base 3 palindrome that starts with 1.
 * @author Georg Fischer
 */
public class A043045 extends A043001 {

  protected int mAdd; // add this number 
  protected int mDiv; // divide by this number 

  /** Construct the sequence. */
  public A043045() {
    this(2, 3, 3, 1);
  }

  /**
   * Generic constructor for similar sequences.
   * @param radix  number system base
   * @param start first digit
   */
  public A043045(final int add, final int div, final int radix, final int start) {
    super(radix, start);
    mAdd = add;
    mDiv = div;
  }

  @Override
  public Z next() {
    return super.next().add(mAdd).divide(mDiv);
  } // next
}
