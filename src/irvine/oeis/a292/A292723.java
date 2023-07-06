package irvine.oeis.a292;
// manually deris/eulerx at 2022-10-26 11:22

import irvine.oeis.a226.A226878;
import irvine.oeis.transform.EulerTransform;

/**
 * A292723 Number of multisets of nonempty words with a total of n letters over 8-ary alphabet such that within each word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * @author Georg Fischer
 */
public class A292723 extends EulerTransform {

  /** Construct the sequence. */
  public A292723() {
    super(new A226878().skip(1), 1);
  }
}
