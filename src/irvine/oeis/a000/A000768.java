package irvine.oeis.a000;

/**
 * A000768 Number of n-step self-avoiding walks on f.c.c. lattice ending at point with x = 3.
 * @author Sean A. Irvine
 */
public class A000768 extends A000766 {

  {
    super.next();
    super.next();
  }

  @Override
  protected int xPos() {
    return 3;
  }
}
