package irvine.oeis.a043;

/**
 * A043551 Least k for which the integers Floor(4k/m) for m=2,3,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A043551 extends A043549 {

  @Override
  protected long multiplier() {
    return 4;
  }
}
