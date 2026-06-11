package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395642.
 * @author Sean A. Irvine
 */
public class A395814 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395814() {
    super(4, CR.PI.pow(5).multiply(6).add(CR.PI.cosh().multiply(5).inverse()).add(CR.PI.sinh().multiply(5).inverse()));
  }
}
