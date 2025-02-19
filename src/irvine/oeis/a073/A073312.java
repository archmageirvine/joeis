package irvine.oeis.a073;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000010;

/**
 * A073312 Number of nonsquarefree numbers in the reduced residue system of n.
 * @author Sean A. Irvine
 */
public class A073312 extends Combiner {

  /** Construct the sequence. */
  public A073312() {
    super(1, new A000010(), new A073311(), SUBTRACT);
  }
}

