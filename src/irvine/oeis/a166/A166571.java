package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A166571 Prime numbers containing the string 10.
 * @author Georg Fischer
 */
public class A166571 extends A000040 {

  private final String mString;

  /** Construct the sequence. */
  public A166571() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param string
   */
  public A166571(final int string) {
    mString = String.valueOf(string);
  }

  @Override
  public Z next() {
    Z prime = super.next();
    while (prime.toString().indexOf(mString) < 0) {
      prime = super.next();
    }
    return prime;
  }
}
