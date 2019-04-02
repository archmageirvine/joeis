package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019252 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite VNI = VPI-9 Rb44K4[ Zn24Si96O240 ] . 48 H2O.
 * @author Sean A. Irvine
 */
public class A019252 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // VNI
    try (final BufferedReader reader = IOUtils.reader("irvine/oeis/a019/a019252.dat.gz")) {
      return IOUtils.readAll(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}

