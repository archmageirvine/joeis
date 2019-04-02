package irvine.oeis.a000;

/**
 * A000761 Number of n-step self-avoiding walks on cubic lattice ending at point with x=2.
 * @author Sean A. Irvine
 */
public class A000761 extends A000760 {

  {
    super.next();
  }

  @Override
  protected int xPos() {
    return 2;
  }
}
