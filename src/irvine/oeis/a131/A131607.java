package irvine.oeis.a131;
// Generated by gen_seq4.pl 2024-05-09/simtraf at 2024-05-09 22:36

import irvine.oeis.a001.A001333;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A131607 Pell companion numbers A001333 without last digit.
 * @author Georg Fischer
 */
public class A131607 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A131607() {
    super(4, new A001333().skip(4), v -> v.divide(10));
  }
}
