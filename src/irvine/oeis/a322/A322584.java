package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-01-16/moetrafi at 2024-01-19 19:57

import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A322584 a(n) is the number of terms of A025487 that divide n.
 * @author Georg Fischer
 */
public class A322584 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A322584() {
    super(1, new A322585(), 0);
    next();
  }
}
