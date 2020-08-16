package irvine.oeis.a000;

/**
 * A000760 Number of <code>n-step self-avoiding</code> walks on cubic lattice ending at point with <code>x=1</code>.
 * @author Sean A. Irvine
 */
public class A000760 extends A000759 {

  {
    super.next();
  }

  @Override
  protected long targetX() {
    return 1;
  }
}
