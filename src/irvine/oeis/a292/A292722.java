package irvine.oeis.a292;
// manually deris/eulerx at 2022-10-26 11:22

import irvine.oeis.SkipSequence;
import irvine.oeis.a226.A226877;
import irvine.oeis.transform.EulerTransform;

/**
 * A292722 Number of multisets of nonempty words with a total of n letters over 7-ary alphabet such that within each word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * @author Georg Fischer
 */
public class A292722 extends EulerTransform {

  /** Construct the sequence. */
  public A292722() {
    super(new SkipSequence(new A226877(), 1), 1);
  }
}
