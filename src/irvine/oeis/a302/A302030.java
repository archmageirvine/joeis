package irvine.oeis.a302;
// Generated by gen_seq4.pl 2024-02-02/dirtral at 2024-02-03 12:44

import irvine.oeis.a006.A006068;
import irvine.oeis.a052.A052331;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A302030 a(n) = 1+A006068(A052331(n)).
 * @author Georg Fischer
 */
public class A302030 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A302030() {
    super(1, new A006068(), new A052331(), (n, v) -> v.add(1));
  }
}
