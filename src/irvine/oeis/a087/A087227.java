package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A087227 Number of distinct prime factors of A087226(n), the LCM of terms in trajectory of 3x+1 (function) initiated at n.
 * @author Sean A. Irvine
 */
public class A087227 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A087227() {
    super(1, new A087226(), Functions.OMEGA::z);
  }
}
