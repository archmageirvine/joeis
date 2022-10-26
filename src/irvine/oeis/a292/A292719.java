package irvine.oeis.a292;
// manually deris/eulerx at 2022-10-26 11:22

import irvine.oeis.SkipSequence;
import irvine.oeis.a092.A092429;
import irvine.oeis.transform.EulerTransform;

/**
 * A292719 Number of multisets of nonempty words with a total of n letters over quaternary alphabet such that within each word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * @author Georg Fischer
 */
public class A292719 extends EulerTransform {

  /** Construct the sequence. */
  public A292719() {
    super(new SkipSequence(new A092429(), 1), 1);
  }
}
