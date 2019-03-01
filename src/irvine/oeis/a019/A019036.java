package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019036.
 * @author Sean A. Irvine
 */
public class A019036 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // LTN
    try (final BufferedReader reader = IOUtils.reader("irvine/oeis/a019/a019036.dat.gz")) {
      return IOUtils.readAll(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}

