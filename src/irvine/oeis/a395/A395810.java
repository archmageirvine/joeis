package irvine.oeis.a395;

import irvine.oeis.a256.A256099;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395605 allocated for Simone Cammarasana.
 * @author Sean A. Irvine
 */
public class A395810 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395810() {
    super(0, new A256099().getCR().inverse());
  }
}
