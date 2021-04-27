package irvine.oeis.a043;

/**
 * A043552 Least k for which the integers floor(5*k/m) for m=2,3,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A043552 extends A043549 {

  @Override
  protected long multiplier() {
    return 5;
  }
}
