package irvine.oeis.a135;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052928;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A135152 A004736 + A128174 - I, I = Identity matrix.
 * @author Georg Fischer
 */
public class A135152 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A135152() {
    super(1, new PrependSequence(new A052928().skip(3), 1));
  }
}

