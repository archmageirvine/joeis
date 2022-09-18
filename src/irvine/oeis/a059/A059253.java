package irvine.oeis.a059;

/**
 * A059253 Hilbert's Hamiltonian walk on N X N projected onto y axis: m'(3).
 * @author Sean A. Irvine
 */
public class A059253 extends A059252 {

  @Override
  protected int select(final int x, final int y) {
    return y;
  }
}
