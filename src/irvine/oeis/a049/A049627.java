package irvine.oeis.a049;

/**
 * A049627 Array T read by diagonals; T(i,j)=(i+1)*(j+1)-H(i,j), where H is the array in A049615; thus T(i,j) is the number of lattice points in rectangle having diagonal (0,0)-to-(i,j) that are visible from (i,j).
 * @author Sean A. Irvine
 */
public class A049627 extends A049615 {

  @Override
  protected long t(final long n, final long m) {
    return (n + 1) * (m + 1) - super.t(n, m);
  }
}
