package irvine.oeis.a003;

/**
 * A003291.
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
