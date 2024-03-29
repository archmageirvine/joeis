package irvine.oeis.a133;
// Generated by gen_seq4.pl 2023-12-08/tuptraf at 2023-12-08 18:44

import irvine.math.cr.CR;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A133999 a(1) = a(2) = 1; a(n+1) = round( a(n) + sqrt(3)*a(n-1) ).
 * @author Georg Fischer
 */
public class A133999 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A133999() {
    super(1, (n, s) -> CR.valueOf(s[0]).add(CR.THREE.sqrt().multiply(s[1])).add(CR.HALF).floor(), "1,1", PREVIOUS, PREVIOUS);
  }
}
