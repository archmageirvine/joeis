package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019049 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite PAU = Paulingite <code>(K2,Ca,Na2)76[ Al152Si520O1344 ]</code>.
 * @author Sean A. Irvine
 */
public class A019049 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // PAU
    try (final BufferedReader reader = IOUtils.reader("irvine/oeis/a019/a019049.dat.gz")) {
      return IOUtils.readAll(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}

