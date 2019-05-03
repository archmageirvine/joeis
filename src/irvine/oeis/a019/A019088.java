package irvine.oeis.a019;

import irvine.oeis.a018.A018940;

/**
 * A019088 Cycle class sequence <code>c(n)</code> (the number of true cycles of length n in which a certain node is included) for zeolite CAS = Cesium Aluminosilicate (Araki) <code>Cs4[ Al4Si20O48 ]</code>.
 * @author Sean A. Irvine
 */
public class A019088 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // CAS
    return "a-1: a-10(000) c-3(0+0) c-3(-00) b-2(000)\n"
      + "b-2: b-8(0++) b-8(-0+) c-3(000)\n"
      + "c-3: c-9(00+)\n"
      + "a-10: c-12(0+0) c-12(-00) b-11(000)\n"
      + "b-8: c-9(000)\n"
      + "a-4: a-7(000) c-6(+00) c-6(0-0) b-5(000)\n"
      + "b-5: b-11(+00) b-11(0-0) c-6(000)\n"
      + "c-6: c-12(000)\n"
      + "a-7: c-9(+00) c-9(0-0) b-8(000)\n"
      + "b-11: c-12(000)\n";
  }
}

