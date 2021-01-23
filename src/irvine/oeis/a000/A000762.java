package irvine.oeis.a000;

/**
 * A000762 Number of n-step self-avoiding walks on cubic lattice ending at point with x=3.
 * @author Sean A. Irvine
 */
public class A000762 extends A000759 {

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
