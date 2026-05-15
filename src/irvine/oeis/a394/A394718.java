package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a083.A083869;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394718 allocated for S. S. Krishna Chaitanya Bulusu.
 * @author Sean A. Irvine
 */
public class A394718 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394718() {
    super(1, new A083869(), Z::square);
  }
}
