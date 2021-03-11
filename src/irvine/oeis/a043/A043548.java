package irvine.oeis.a043;

/**
 * A043548 Least separator of first n Egyptian fractions; i.e., least k for which the integers floor(k/m) for m=1,2,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A043548 extends A043549 {

  @Override
  protected long multiplier() {
    return 1;
  }
}
