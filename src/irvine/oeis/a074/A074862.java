package irvine.oeis.a074;
// Generated by gen_seq4.pl 2023-11-13/tuptraf at 2023-11-17 15:02

import irvine.math.z.ZUtils;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A074862 Iccanartet sequence: a(n)=R[a(n-1)]+R[a(n-2)]+R[a(n-3)]+R[a(n-4)] where a(1)=a(2)=a(3)=a(4)=1 and R(n) (A004086) is the reverse of n.
 * @author Georg Fischer
 */
public class A074862 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A074862() {
    super(1, (n, s) -> ZUtils.reverse(s[0]).add(ZUtils.reverse(s[1])).add(ZUtils.reverse(s[2])).add(ZUtils.reverse(s[3])), "1,1,1,1", PREVIOUS, PREVIOUS, PREVIOUS, PREVIOUS);
  }
}
