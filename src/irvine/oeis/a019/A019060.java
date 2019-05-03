package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019060 Cycle class sequence <code>c(2n) (the</code> number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite SOD = Sodalite <code>Na6[ Al6Si6O24 ] . 2</code> NaCl.
 * @author Sean A. Irvine
 */
public class A019060 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // SOD
    return "a-1: a-6(0-0) a-5(000) a-4(00+) a-2(000)\n"
      + "a-2: a-6(000) a-5(-00) a-3(00+)\n"
      + "a-4: a-6(+00) a-5(000)\n"
      + "a-3: a-6(000) a-5(0+0) a-4(000)\n";
  }
}

