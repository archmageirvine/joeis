package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.oeis.a055.A055394;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078388 Arithmetic derivative of numbers which can be written as sum of a positive square and a positive cube.
 * @author Sean A. Irvine
 */
public class A078388 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078388() {
    super(1, new A055394(), Functions.ARD::z);
  }
}

