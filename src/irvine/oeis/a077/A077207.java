package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077207 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077207() {
    super(1, new A077206(), Functions.TRINV::z);
  }
}

