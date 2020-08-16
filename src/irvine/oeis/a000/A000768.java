package irvine.oeis.a000;

/**
 * A000768 Number of <code>n-step self-avoiding</code> walks on f.c.c. lattice ending at point with <code>x = 3</code>.
 * @author Sean A. Irvine
 */
public class A000768 extends A000765 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  protected long targetX() {
    return 3;
  }
}
