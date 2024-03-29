package irvine.oeis.a253;
// Generated by gen_seq4.pl ca2on2/ca2on2n1 at 2021-12-27 18:33

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A253087 a(n) = A253086(2^n-1).
 * @author Georg Fischer
 */
public class A253087 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A253087() {
    super(260);
  }

  @Override
  public Z next() {
    return super.nextOn2n1();
  }
}
