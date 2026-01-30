package irvine.oeis.a392;

import irvine.oeis.a332.A332785;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392564 Cubes of numbers that are neither squarefree nor squareful.
 * @author Sean A. Irvine
 */
public class A392564 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392564() {
    super(1, new A332785(), k -> k.pow(3));
  }
}
