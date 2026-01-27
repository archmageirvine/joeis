package irvine.oeis.a392;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a143.A143512;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392778 allocated for Frank M Jackson.
 * @author Sean A. Irvine
 */
public class A392778 extends FilterSequence {

  /** Construct the sequence. */
  public A392778() {
    super(1, new SimpleTransformSequence(new A143512(), Z::multiply2), Predicates.PRACTICAL::is);
  }
}
