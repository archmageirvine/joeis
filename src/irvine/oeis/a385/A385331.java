package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.oeis.a145.A145571;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A385331 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A385331 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A385331() {
    super(1, new A145571(), Functions.LPF::z);
  }
}

