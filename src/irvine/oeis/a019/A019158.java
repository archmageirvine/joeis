package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019158 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite MFI = ZSM-5 Nan[ AlnSi96-nO192 ].
 * @author Sean A. Irvine
 */
public class A019158 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // MFI
    try (final BufferedReader reader = IOUtils.reader("irvine/oeis/a019/a019158.dat.gz")) {
      return IOUtils.readAll(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}

