package irvine.oeis.a006;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.a002.A002001;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A006342 Coloring a circuit with 4 colors.
 * @author Sean A. Irvine
 */
public class A006342 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A006342() {
    super(new AlternatingSequence(new A002001(), new A000004()), 0);
  }
}

