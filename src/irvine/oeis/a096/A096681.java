package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A096681 Least k such that decimal representation of k*n contains only digits 0 and 2.
 * @author Georg Fischer
 */
public class A096681 extends Sequence1 {

  private int mN;
  private final String mPattern;

  /** Construct the sequence. */
  public A096681() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param digit1 first digit
   * @param digit2 second digit
   */
  public A096681(final int digit1, final int digit2) {
    mN = 0;
    mPattern = "[" + digit1 + digit2 + "]+";
  }

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.multiply(mN).toString().matches(mPattern)) {
        return k;
      }
    }
  }
}
