package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346452 a(n) = [x^n] Product_{k&gt;=1} (1 + n^(k-1)*x^k) / (1 - n^(k-1)*x^k).
 * @author Sean A. Irvine
 */
public class A346452 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346452() {
    super(CR.PI.pow(2).divide(CR.THREE.sqrt().multiply(6)));
  }
}

