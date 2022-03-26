package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086801 a(n) = prime(n) - 3.
 * @author Georg Fischer
 */
public class A086801 extends A000040 {

  private int mAdd;

  /** Construct the sequence. */
  public A086801() {
    this(-3);
  }

  /**
   * Generic constructor with parameter
   * @param add add this number to the prime
   */
  public A086801(final int add) {
    mAdd = add;
  }

  @Override
  public Z next() {
    return super.next().add(mAdd);
  }
}
