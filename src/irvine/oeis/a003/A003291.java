package irvine.oeis.a003;

/**
 * A003291 Number of n-step self-avoiding walks on hexagonal lattice from <code>(0,0)</code> to <code>(1,1)</code>.
 * @author Sean A. Irvine
 */
public class A003291 extends A003290 {

  @Override
  protected long search() {
    // search(0, 0, 3, 1, mN, 1); // Less efficient
    use(0, 0);
    return search(1, 1, 3, 1, mN - 1, 2) + search(-2, 0, 3, 1, mN - 1, 2) + search(-1, 1, 3, 1, mN - 1, 2);
  }

}
