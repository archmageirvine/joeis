package irvine.oeis.a060;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060202 Let G = complete graph on 4 vertices, create the sequence G, L(G), L(L(G)), L(L(L(G))), ... where each graph in this sequence is the line graph of the previous graph; a(n) is number of vertices of the n-th graph in this sequence.
 * @author Sean A. Irvine
 */
public class A060202 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.FOUR : Integers.SINGLETON.product(2, mN, k -> Z.ONE.shiftLeft(k - 2).add(1)).multiply(6);
  }
}
