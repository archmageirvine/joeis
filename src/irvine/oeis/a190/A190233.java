package irvine.oeis.a190;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A190233 a(n) = [n*u+n*v] - [n*u] - [n*v], where u=sin(Pi/8), v=cos(Pi/8), and []=floor.
 * @author Georg Fischer
 */
public class A190233 extends Sequence1 {
  private long mN = 0;
  private static final CR U = CR.PI.divide(CR.EIGHT).sin();
  private static final CR V = CR.PI.divide(CR.EIGHT).cos();

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(U).add(n.multiply(V)).floor().subtract(n.multiply(U).floor()).subtract(n.multiply(V).floor());
  }
}
