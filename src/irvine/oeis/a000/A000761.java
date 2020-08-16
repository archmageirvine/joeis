package irvine.oeis.a000;

/**
 * A000761 Number of <code>n-step self-avoiding</code> walks on cubic lattice ending at point with <code>x=2</code>.
 * @author Sean A. Irvine
 */
public class A000761 extends A000759 {

  {
    super.next();
    super.next();
  }

  @Override
  protected long targetX() {
    return 2;
  }
}
