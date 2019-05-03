package irvine.oeis.a000;

/**
 * A000762 Number of <code>n-step self-avoiding</code> walks on cubic lattice ending at point with <code>x=3</code>.
 * @author Sean A. Irvine
 */
public class A000762 extends A000760 {

  {
    super.next();
    super.next();
  }

  @Override
  protected int xPos() {
    return 3;
  }
}
