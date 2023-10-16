package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024075;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366634 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A366634 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366634() {
    super(1, new A024075().skip(), k -> Jaguar.factor(k).sigma());
  }
}

