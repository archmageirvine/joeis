package irvine.oeis.a000;

/**
 * A000760 Number of n-step self-avoiding walks on cubic lattice ending at point with x=1.
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
