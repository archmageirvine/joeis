package irvine.oeis.a076;
// Generated by gen_seq4.pl 2023-12-03/tuptraf at 2023-12-03 21:34

import irvine.oeis.transform.TupleTransformSequence;

/**
 * A076678 a(0)=a(1)=1 a(n)=floor(sqrt(a(n-1)))+a(n-2).
 * @author Georg Fischer
 */
public class A076678 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A076678() {
    super(0, (n, s) -> s[0].sqrt().add(s[1]), "1, 1", PREVIOUS, PREVIOUS);
  }
}
