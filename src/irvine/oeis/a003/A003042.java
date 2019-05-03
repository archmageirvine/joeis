package irvine.oeis.a003;

/**
 * A003042 Number of directed Hamiltonian cycles (or Gray codes) on <code>n-cube</code>.
 * @author Sean A. Irvine
 */
public class A003042 extends A003043 {

  @Override
  protected boolean filter(final int lastUsed) {
    return (lastUsed & (lastUsed - 1)) == 0;
  }
}
