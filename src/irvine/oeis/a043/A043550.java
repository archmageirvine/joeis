package irvine.oeis.a043;

/**
 * A043550 Least k for which the integers Floor(3k/m) for m=2,3,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A043550 extends A043549 {

  @Override
  protected long multiplier() {
    return 3;
  }
}
